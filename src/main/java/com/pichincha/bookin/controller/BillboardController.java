package com.pichincha.bookin.controller;
import com.pichincha.bookin.service.BillboardService;
import com.pichincha.bookin.service.dto.BillboardDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/billboard")
@AllArgsConstructor
public class BillboardController {

    private BillboardService billboardService;
    @GetMapping
    public ResponseEntity<List<BillboardDto>> getBillboardDtos() {
        return ResponseEntity.ok(billboardService.getAllBillboard());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillboardDto> getByIdBillboardDtos(@PathVariable Integer id) {
        return ResponseEntity.ok(billboardService.getBillboardById(id));
    }

    @PostMapping
    public ResponseEntity<BillboardDto> createBillboardDtos(@RequestBody BillboardDto billboardDto) {
        return ResponseEntity.ok(billboardService.createBillboard(billboardDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BillboardDto> updateBillboardDtos(@PathVariable Integer id, @RequestBody BillboardDto billboardDto) {
        return ResponseEntity.ok(billboardService.updateBillboard(id, billboardDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> getBillboardDtos(@PathVariable Integer id) {
        billboardService.deleteBillboard(id);
        return ResponseEntity.noContent().build();
    }
}